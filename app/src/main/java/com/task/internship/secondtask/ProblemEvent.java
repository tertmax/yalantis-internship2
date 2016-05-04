package com.task.internship.secondtask;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ProblemEvent implements Parcelable {

    public static final Parcelable.Creator<ProblemEvent> CREATOR = new Parcelable.Creator<ProblemEvent>() {
        public ProblemEvent createFromParcel(Parcel in) {
            return new ProblemEvent(in);
        }

        public ProblemEvent[] newArray(int size) {
            return new ProblemEvent[size];
        }
    };
    private Context mContext;
    private String mDescription;
    private String mAddress;
    private String mFirstDate;
    private String mRegisteredDate;
    private String mSolveDate;
    private String mDays;
    private String mTitle;
    private String mResponsible;
    private String mDetails;
    private int mLikeCount;
    private ProblemType mType;
    private String mState;
    private List<String> mPictures;

    ProblemEvent(Parcel in) {

        mDescription = in.readString();
        mAddress = in.readString();
        mFirstDate = in.readString();
        mRegisteredDate = in.readString();
        mSolveDate = in.readString();
        mDays = in.readString();
        mTitle = in.readString();
        mPictures = in.createStringArrayList();
        mState = in.readString();
        mResponsible = in.readString();
        mDetails = in.readString();

    }

    public ProblemEvent(String problemDescription, String problemAddress, String responsible, Calendar firstDate, Calendar registeredDate, Calendar solveDate
            , String problemTitle, int likeCount, ProblemType type, Context context) {
        mContext = context;
        mDescription = problemDescription;
        mAddress = problemAddress;
        mResponsible = responsible;
        String[] months = mContext.getResources().getStringArray(R.array.months_array);
        mFirstDate = months[firstDate.get(Calendar.MONTH)] + " " + firstDate.get(Calendar.DAY_OF_MONTH) + ", " + firstDate.get(Calendar.YEAR);
        mRegisteredDate = months[registeredDate.get(Calendar.MONTH)] + " " + registeredDate.get(Calendar.DAY_OF_MONTH) + ", " + registeredDate.get(Calendar.YEAR);
        mSolveDate = months[solveDate.get(Calendar.MONTH)] + " " + solveDate.get(Calendar.DAY_OF_MONTH) + ", " + solveDate.get(Calendar.YEAR);
        int daysCount = solveDate.get(Calendar.DAY_OF_YEAR) - registeredDate.get(Calendar.DAY_OF_YEAR);
        String daysWord = mContext.getString(R.string.dniv_list_text);
        if (daysCount % 100 == 11 | daysCount % 100 == 12 | daysCount % 100 == 13 | daysCount % 100 == 14)
            daysWord = mContext.getString(R.string.dniv_list_text);
        else if (daysCount % 10 == 1) daysWord = mContext.getString(R.string.den_list_text);
        else if ((daysCount % 10 == 2) | (daysCount % 10 == 3) | (daysCount % 10 == 4))
            daysWord = mContext.getString(R.string.dni_list_text);
        mDays = Integer.toString(daysCount) + daysWord;
        mTitle = problemTitle;
        mLikeCount = likeCount;
        mType = type;
        if (daysCount == 0) mDays = mContext.getString(R.string.urgent_list_text);
        mPictures = new ArrayList<>();
        mState = mContext.getString(R.string.in_progress_state_text);
    }

    public String getState() {
        return mState;
    }

    public void setState(State state) {
        switch (state) {
            case IN_PROGRESS:
                mState = mContext.getString(R.string.in_progress_state_text);
                break;
            case COMPLETE:
                mState = mContext.getString(R.string.complete_state_text);
                mDays = mContext.getString(R.string.complete_list_text);
                break;
            case WAITING:
                mState = mContext.getString(R.string.awaits_state_text);
                break;
        }
    }

    public String getResponsible() {
        return mResponsible;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setDetails(String details) {
        mDetails = details;
    }

    public String getFirstDate() {
        return mFirstDate;
    }

    public String getSolveDate() {
        return mSolveDate;
    }

    public List<String> getPictures() {
        return mPictures;
    }

    public void addPicture(String link) {
        mPictures.add(link);
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getRegisteredDate() {
        return mRegisteredDate;
    }

    public String getDays() {
        return mDays;
    }

    public int getLikeCount() {
        return mLikeCount;
    }


    public int getTypeIconResource() {
        switch (mType) {
            case TYPE_UTILITY:
                return R.drawable.icon_utility;
            case TYPE_CITY:
                return R.drawable.icon_city;
            case TYPE_ELECTRICITY:
                return R.drawable.icon_electricity;
            case TYPE_TRANSPORT:
                return R.drawable.icon_transport;
            default:
                return R.drawable.icon_city;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(mDescription);
        out.writeString(mAddress);
        out.writeString(mFirstDate);
        out.writeString(mRegisteredDate);
        out.writeString(mSolveDate);
        out.writeString(mDays);
        out.writeString(mTitle);
        out.writeStringList(mPictures);
        out.writeString(mState);
        out.writeString(mResponsible);
        out.writeString(mDetails);

    }

    public enum ProblemType {
        TYPE_UTILITY, TYPE_CITY, TYPE_ELECTRICITY, TYPE_TRANSPORT
    }

    public enum State {
        IN_PROGRESS, COMPLETE, WAITING
    }
}


