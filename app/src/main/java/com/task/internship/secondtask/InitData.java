package com.task.internship.secondtask;

import android.content.Context;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class InitData {

    private static List<ProblemEvent> recyclerOneData;
    private static List<ProblemEvent> recyclerTwoData;
    private static List<ProblemEvent> listData;

    public static List<ProblemEvent> getRecyclerOneData(Context context) {

        if (recyclerOneData != null) {
            return recyclerOneData;
        }

        List<ProblemEvent> dataSet = new ArrayList<>();

        Calendar firstDate = new GregorianCalendar(2016, 4, 15);
        Calendar registeredDate = new GregorianCalendar(2016, 4, 16);
        Calendar solveDate = new GregorianCalendar(2016, 4, 21);
        ProblemEvent pe = new ProblemEvent("Комунальне господарство",
                "Дніпропетровськ, вул. Б. Кротова, 22", "Дніпропетровський МВК",
                firstDate, registeredDate, solveDate, "CE-1234567", 13, ProblemEvent.ProblemType.TYPE_UTILITY, context);
        pe.addPicture("http://goo.gl/rOf8I0");
        pe.addPicture("http://goo.gl/O7qqhg");
        pe.addPicture("http://goo.gl/la1Bdi");
        pe.addPicture("http://goo.gl/5aRPe0");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Відчинений люк (біля рекламного щита). Перетин поворотів 18-го та 19-го трамваїв на проспект Мира.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 14);
        registeredDate = new GregorianCalendar(2016, 4, 15);
        solveDate = new GregorianCalendar(2016, 4, 20);
        pe = new ProblemEvent("Благоустрій та будівництво", "Дніпропетровськ, вул. Олеся Гончара, 13",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-9876543", 19,
                ProblemEvent.ProblemType.TYPE_CITY, context);
        pe.addPicture("https://goo.gl/LrXz02");
        pe.addPicture("https://goo.gl/N99KlS");
        pe.addPicture("http://goo.gl/jpkgSs");
        pe.addPicture("http://goo.gl/la1Bdi");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Демонтаж аварійної споруди (Арка дружби народів). Вхід в цетральний парк.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 14);
        registeredDate = new GregorianCalendar(2016, 4, 14);
        solveDate = new GregorianCalendar(2016, 4, 18);
        pe = new ProblemEvent("Заміна спецавтомобілів швидкої допомоги", "Дніпропетровськ, вул. Стромцова, 1",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-1029384", 7,
                ProblemEvent.ProblemType.TYPE_TRANSPORT, context);
        pe.addPicture("http://goo.gl/ASLfxZ");
        pe.addPicture("http://goo.gl/mdhM9A");
        pe.addPicture("http://goo.gl/DPElD4");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Запит до адміністрації на виділеняя 43 млн грн на закупівлю спецавтомобілів швидкої допомоги");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 13);
        registeredDate = new GregorianCalendar(2016, 4, 14);
        solveDate = new GregorianCalendar(2016, 4, 19);
        pe = new ProblemEvent("Борг за електроенергію", "Дніпропетровськ, просп. Поля, 43",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-9182736", 5,
                ProblemEvent.ProblemType.TYPE_ELECTRICITY, context);
        pe.addPicture("http://goo.gl/jpkgSs");
        pe.addPicture("https://goo.gl/znNmDv");
        pe.addPicture("http://goo.gl/oPdx9C");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Неправильно розраховані суми до сплати при використанні пільг/субсидій на суму 7654 грн.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 11);
        registeredDate = new GregorianCalendar(2016, 4, 12);
        solveDate = new GregorianCalendar(2016, 4, 23);
        pe = new ProblemEvent("Комунальне господарство", "Дніпропетровськ, вул. Харківська, 3",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-6574839", 23,
                ProblemEvent.ProblemType.TYPE_UTILITY, context);
        pe.addPicture("https://goo.gl/Jt55Bl");
        pe.addPicture("https://goo.gl/h6DEk8");
        pe.addPicture("http://goo.gl/5aRPe0");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Зламані приладдя на дитячому майданчику на території дит. саду.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 11);
        registeredDate = new GregorianCalendar(2016, 4, 11);
        solveDate = new GregorianCalendar(2016, 4, 20);
        pe = new ProblemEvent("Питання щодо нового маршрутного таксі",
                "Дніпропетровськ, вул. Панікахи", "Дніпропетровський МВК", firstDate, registeredDate,
                solveDate, "CE-5283746", 14, ProblemEvent.ProblemType.TYPE_TRANSPORT, context);
        pe.addPicture("http://goo.gl/T4ULNf");
        pe.addPicture("http://goo.gl/5lzTmj");
        pe.addPicture("http://goo.gl/NWbTuE");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Запит на проведення конкурсу на обслуговування нового маршруту (ж/м Перемога 6 - ж/м Перемога 1, просп. Слабожанський, смт. Придніпровськ)");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 13);
        registeredDate = new GregorianCalendar(2016, 4, 14);
        solveDate = new GregorianCalendar(2016, 4, 19);
        pe = new ProblemEvent("Борг за електроенергію", "Дніпропетровськ, просп. Гагаріна, 22",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-1765234", 15,
                ProblemEvent.ProblemType.TYPE_ELECTRICITY, context);
        pe.addPicture("https://goo.gl/vuJNpW");
        pe.addPicture("https://goo.gl/znNmDv");
        pe.addPicture("http://goo.gl/jpkgSs");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Неправильно розраховані суми до сплати при використанні пільг/субсидій на суму 1234 грн.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 10);
        registeredDate = new GregorianCalendar(2016, 4, 11);
        solveDate = new GregorianCalendar(2016, 4, 19);
        pe = new ProblemEvent("Благоустрій та будівництво", "Дніпропетровськ, вул. Космічна, 1",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-7534745", 7,
                ProblemEvent.ProblemType.TYPE_CITY, context);
        pe.addPicture("https://goo.gl/MdzU0o");
        pe.addPicture("http://goo.gl/TYniXQ");
        pe.addPicture("https://goo.gl/tWeNV9");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Реставрація занедбаного скверу біля Тонельної балки.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 7);
        registeredDate = new GregorianCalendar(2016, 4, 8);
        solveDate = new GregorianCalendar(2016, 4, 30);
        pe = new ProblemEvent("Ремонт транспорта на маршруті №157", "Дніпропетровськ, просп. Петровського, 1",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-8475637", 24,
                ProblemEvent.ProblemType.TYPE_TRANSPORT, context);
        pe.addPicture("http://goo.gl/T4ULNf");
        pe.addPicture("http://goo.gl/5lzTmj");
        pe.addPicture("http://goo.gl/NWbTuE");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Запит на виділення коштіф для ремонту автомобілів маршруту №157. Необхідна сума: 1 млн. грн.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 7);
        registeredDate = new GregorianCalendar(2016, 4, 9);
        solveDate = new GregorianCalendar(2016, 4, 16);
        pe = new ProblemEvent("Комунальне господарство", "Дніпропетровськ, вул. Московська, 8",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-1243657", 3,
                ProblemEvent.ProblemType.TYPE_UTILITY, context);
        pe.addPicture("http://goo.gl/la1Bdi");
        pe.addPicture("https://goo.gl/Pbv8Tc");
        pe.addPicture("https://goo.gl/EFUVJ3");
        pe.setState(ProblemEvent.State.IN_PROGRESS);
        pe.setDetails("Вирізаний телефонний кабель.");
        dataSet.add(pe);

        recyclerOneData = dataSet;

        return dataSet;
    }

    public static List<ProblemEvent> getRecyclerTwoData(Context context) {
        if (recyclerTwoData != null) {
            return recyclerTwoData;
        }
        List<ProblemEvent> dataSet = new ArrayList<>();

        Calendar firstDate = new GregorianCalendar(2016, 3, 7);
        Calendar registeredDate = new GregorianCalendar(2016, 3, 7);
        Calendar solveDate = new GregorianCalendar(2016, 3, 10);
        ProblemEvent pe = new ProblemEvent("Дорожньо-транспортна пригода",
                "Дніпропетровськ, вул. Б. Панікахи, 2", "Дніпропетровський МВК",
                firstDate, registeredDate, solveDate, "CE-3214567", 18, ProblemEvent.ProblemType.TYPE_TRANSPORT, context);
        pe.addPicture("http://goo.gl/WSbhJC");
        pe.addPicture("http://goo.gl/i3gYV8");
        pe.setState(ProblemEvent.State.COMPLETE);
        pe.setDetails("Водій автомобіля «Daewoo» перевисив максимально допустиму швидкість на дільниці дороги, та вилетів у кювет.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 3, 4);
        registeredDate = new GregorianCalendar(2016, 3, 5);
        solveDate = new GregorianCalendar(2016, 3, 14);
        pe = new ProblemEvent("Заборгованість ", "Дніпропетровськ, вул. Січових Стрільців, 19",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-9876543", 5,
                ProblemEvent.ProblemType.TYPE_ELECTRICITY, context);
        pe.addPicture("https://goo.gl/LrXz02");
        pe.addPicture("https://goo.gl/N99KlS");
        pe.addPicture("http://goo.gl/jpkgSs");
        pe.addPicture("http://goo.gl/la1Bdi");
        pe.setState(ProblemEvent.State.COMPLETE);
        pe.setDetails("Неправильно розраховані суми за сплату електроенергії до сплати при використанні пільг/субсидій.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 3, 4);
        registeredDate = new GregorianCalendar(2016, 3, 4);
        solveDate = new GregorianCalendar(2016, 3, 4);
        pe = new ProblemEvent("Дорожньо-транспортна пригода", "Дніпропетровськ, вул. Вигадана, 2",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-3229384", 4,
                ProblemEvent.ProblemType.TYPE_TRANSPORT, context);
        pe.addPicture("http://goo.gl/ssJUZ3");
        pe.addPicture("http://goo.gl/TKelvV");
        pe.setState(ProblemEvent.State.COMPLETE);
        pe.setDetails("За попередніми даними водій автомобіля «ГАЗ-3302», перебуваючи у нетверезому стані, виїхав на зустрічну смугу руху, де скоїв зіткнення з автомобілем «ГАЗ-3302».");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 3, 3);
        registeredDate = new GregorianCalendar(2016, 3, 3);
        solveDate = new GregorianCalendar(2016, 3, 8);
        pe = new ProblemEvent("Борг за електроенергію", "Дніпропетровськ, вулю Одеська, 3",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-5482736", 12,
                ProblemEvent.ProblemType.TYPE_ELECTRICITY, context);
        pe.addPicture("https://goo.gl/znNmDv");
        pe.addPicture("https://goo.gl/h6DEk8");
        pe.addPicture("http://goo.gl/jpkgSs");
        pe.addPicture("http://goo.gl/oPdx9C");


        pe.setState(ProblemEvent.State.COMPLETE);
        pe.setDetails("Неправильно розраховані суми до сплати при використанні пільг/субсидій.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 2, 24);
        registeredDate = new GregorianCalendar(2016, 2, 24);
        solveDate = new GregorianCalendar(2016, 2, 26);
        pe = new ProblemEvent("Комунальне господарство", "Дніпропетровськ, вул. Харківська, 3",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-6444839", 3,
                ProblemEvent.ProblemType.TYPE_UTILITY, context);
        pe.addPicture("https://goo.gl/Jt55Bl");
        pe.addPicture("http://goo.gl/5aRPe0");
        pe.addPicture("http://vk.cc/544Y2g");
        pe.setState(ProblemEvent.State.COMPLETE);
        pe.setDetails("Вирізаний телефонний кабель.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 2, 22);
        registeredDate = new GregorianCalendar(2016, 2, 22);
        solveDate = new GregorianCalendar(2016, 2, 26);
        pe = new ProblemEvent("Зміна графіку роботи маршрутного таксі",
                "Дніпропетровськ, вул. Таксійна, 1", "Дніпропетровський МВК", firstDate, registeredDate,
                solveDate, "CE-5433746", 14, ProblemEvent.ProblemType.TYPE_TRANSPORT, context);
        pe.addPicture("https://goo.gl/3gTEQN");
        pe.addPicture("https://goo.gl/wqDODA");
        pe.addPicture("https://goo.gl/3gTEQN");
        pe.setState(ProblemEvent.State.COMPLETE);
        pe.setDetails("Запит на внесення коректировок у маршрут №89.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 2, 15);
        registeredDate = new GregorianCalendar(2016, 2, 16);
        solveDate = new GregorianCalendar(2016, 2, 19);
        pe = new ProblemEvent("Комунальне господарство", "Дніпропетровськ, ж/м Червоний камінь",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-13345234", 1,
                ProblemEvent.ProblemType.TYPE_UTILITY, context);
        pe.addPicture("https://goo.gl/MdzU0o");
        pe.addPicture("http://goo.gl/TYniXQ");
        pe.addPicture("http://goo.gl/jpkgSs");
        pe.setState(ProblemEvent.State.COMPLETE);
        pe.setDetails("Яма 50х70 см., що заважае проїзду у дворі.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 2, 10);
        registeredDate = new GregorianCalendar(2016, 2, 11);
        solveDate = new GregorianCalendar(2016, 2, 19);
        pe = new ProblemEvent("Сплата заборгованості", "Дніпропетровськ, вул. Донецька, 65",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-4134745", 17,
                ProblemEvent.ProblemType.TYPE_ELECTRICITY, context);
        pe.addPicture("http://goo.gl/la1Bdi");
        pe.addPicture("https://goo.gl/Pbv8Tc");
        pe.addPicture("https://goo.gl/vuJNpW");
        pe.setState(ProblemEvent.State.COMPLETE);
        pe.setDetails("Неправильно розраховані суми до сплати при використанні пільг/субсидій.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 2, 9);
        registeredDate = new GregorianCalendar(2016, 2, 9);
        solveDate = new GregorianCalendar(2016, 2, 15);
        pe = new ProblemEvent("Зміна графіку роботи маршрутного таксі",
                "Дніпропетровськ, вул. Таксійна, 89", "Дніпропетровський МВК", firstDate, registeredDate,
                solveDate, "CE-7653746", 1, ProblemEvent.ProblemType.TYPE_TRANSPORT, context);
        pe.addPicture("https://goo.gl/3gTEQN");
        pe.addPicture("https://goo.gl/3gTEQN");
        pe.addPicture("https://goo.gl/wqDODA");
        pe.setState(ProblemEvent.State.COMPLETE);
        pe.setDetails("Запит на внесення коректировок у маршрут №88.");
        dataSet.add(pe);

        recyclerTwoData = dataSet;

        return dataSet;
    }

    public static List<ProblemEvent> getListData(Context context) {

        if (listData != null) {
            return listData;
        }

        List<ProblemEvent> dataSet = new ArrayList<>();

        Calendar firstDate = new GregorianCalendar(2016, 4, 19);
        Calendar registeredDate = new GregorianCalendar(2016, 4, 20);
        Calendar solveDate = new GregorianCalendar(2016, 5, 30);
        ProblemEvent pe = new ProblemEvent("Благоустрій та будівництво",
                "Дніпропетровськ, вул. Вулиця, 31", "Дніпропетровський МВК",
                firstDate, registeredDate, solveDate, "CE-7654567", 13, ProblemEvent.ProblemType.TYPE_CITY, context);
        pe.addPicture("https://goo.gl/N99KlS");
        pe.addPicture("http://goo.gl/la1Bdi");
        pe.addPicture("http://goo.gl/5aRPe0");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Тут все добре. Дякую за увагу.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 18);
        registeredDate = new GregorianCalendar(2016, 4, 19);
        solveDate = new GregorianCalendar(2016, 5, 12);
        pe = new ProblemEvent("Благоустрій та будівництво", "Дніпропетровськ, вул. Полтавська, 32",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-1643657", 13,
                ProblemEvent.ProblemType.TYPE_CITY, context);
        pe.addPicture("https://goo.gl/znNmDv");
        pe.addPicture("https://goo.gl/tWeNV9");
        pe.addPicture("https://goo.gl/EFUVJ3");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Там все нормально, робити нічого не треба.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 16);
        registeredDate = new GregorianCalendar(2016, 4, 17);
        solveDate = new GregorianCalendar(2016, 5, 15);
        pe = new ProblemEvent("Комунальне господарство", "Дніпропетровськ, вул. Тестова, 43",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-9876565", 19,
                ProblemEvent.ProblemType.TYPE_UTILITY, context);
        pe.addPicture("http://goo.gl/la1Bdi");
        pe.addPicture("https://goo.gl/LrXz02");
        pe.addPicture("http://goo.gl/jpkgSs");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Демонтаж аварійної споруди (ОДА).");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 17);
        registeredDate = new GregorianCalendar(2016, 4, 17);
        solveDate = new GregorianCalendar(2016, 5, 7);
        pe = new ProblemEvent("Борг за електроенергію", "Дніпропетровськ, просп. Слабожанський, 34",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-1312736", 1,
                ProblemEvent.ProblemType.TYPE_ELECTRICITY, context);
        pe.addPicture("http://goo.gl/jpkgSs");
        pe.addPicture("https://goo.gl/znNmDv");
        pe.addPicture("http://goo.gl/oPdx9C");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Неправильно розраховані суми до сплати при використанні пільг/субсидій.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 16);
        registeredDate = new GregorianCalendar(2016, 4, 17);
        solveDate = new GregorianCalendar(2016, 5, 6);
        pe = new ProblemEvent("Комунальне господарство", "Дніпропетровськ, вул. Кексова, 23",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-6484833", 11,
                ProblemEvent.ProblemType.TYPE_UTILITY, context);
        pe.addPicture("https://goo.gl/Jt55Bl");
        pe.addPicture("https://goo.gl/h6DEk8");
        pe.addPicture("http://goo.gl/5aRPe0");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Тестова інформація про комунальне господарство.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 15);
        registeredDate = new GregorianCalendar(2016, 4, 16);
        solveDate = new GregorianCalendar(2016, 5, 3);
        pe = new ProblemEvent("Питання щодо нового маршрутного таксі",
                "Дніпропетровськ, вул. Панікахи", "Дніпропетровський МВК", firstDate, registeredDate,
                solveDate, "CE-5283746", 8, ProblemEvent.ProblemType.TYPE_TRANSPORT, context);
        pe.addPicture("https://goo.gl/3gTEQN");
        pe.addPicture("https://goo.gl/wqDODA");
        pe.addPicture("https://goo.gl/3gTEQN");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Тестова інформація про соглосування змін в маршруті.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 14);
        registeredDate = new GregorianCalendar(2016, 4, 15);
        solveDate = new GregorianCalendar(2016, 5, 1);
        pe = new ProblemEvent("Борг за електроенергію", "Дніпропетровськ, вул. Козацька, 6",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-11666534", 6,
                ProblemEvent.ProblemType.TYPE_ELECTRICITY, context);
        pe.addPicture("https://goo.gl/vuJNpW");
        pe.addPicture("https://goo.gl/znNmDv");
        pe.addPicture("http://goo.gl/jpkgSs");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Тестова інформація про борги за електроенергію.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 12);
        registeredDate = new GregorianCalendar(2016, 4, 13);
        solveDate = new GregorianCalendar(2016, 4, 30);
        pe = new ProblemEvent("Благоустрій та будівництво", "Дніпропетровськ, вул. Ворошилова, 14",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-7516853", 10,
                ProblemEvent.ProblemType.TYPE_CITY, context);
        pe.addPicture("https://goo.gl/MdzU0o");
        pe.addPicture("http://goo.gl/TYniXQ");
        pe.addPicture("https://goo.gl/tWeNV9");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Неупорядкований та непобудований участок, що потребує упорядкування та збудову.");
        pe.setDetails("Тестова інформація про благоустрій та будівництво.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 8);
        registeredDate = new GregorianCalendar(2016, 4, 9);
        solveDate = new GregorianCalendar(2016, 4, 27);
        pe = new ProblemEvent("Комунальне господарство", "Дніпропетровськ, вул. Київська, 37",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-1375651", 9,
                ProblemEvent.ProblemType.TYPE_UTILITY, context);
        pe.addPicture("http://goo.gl/la1Bdi");
        pe.addPicture("https://goo.gl/Pbv8Tc");
        pe.addPicture("https://goo.gl/EFUVJ3");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Тестова інформація про ще одне комунальне господарство.");
        dataSet.add(pe);

        firstDate = new GregorianCalendar(2016, 4, 7);
        registeredDate = new GregorianCalendar(2016, 4, 7);
        solveDate = new GregorianCalendar(2016, 4, 28);
        pe = new ProblemEvent("Благоустрій та будівництво", "Дніпропетровськ, вул. Остання, 1",
                "Дніпропетровський МВК", firstDate, registeredDate, solveDate, "CE-1883657", 99,
                ProblemEvent.ProblemType.TYPE_CITY, context);
        pe.addPicture("https://goo.gl/znNmDv");
        pe.addPicture("https://goo.gl/EFUVJ3");
        pe.addPicture("https://goo.gl/tWeNV9");
        pe.setState(ProblemEvent.State.WAITING);
        pe.setDetails("Якась остання тестова інформація.");
        dataSet.add(pe);

        listData = dataSet;

        return dataSet;
    }
}
