package com.example.course_work_mobile.data

import com.example.course_work_mobile.R

object CardStorage {
    fun getCardList():List<Card>{
        return listOf(
            Card(
                "Хинидин",
                "Кинидин, Дурулес",
                "Антиритмические средства, IA класс.",
                "Блокирует Na-каналы, снижает проводимость предсердий, волокон Пуркинье, желудочков; " +
                        "снижает автоматизм волокон Пуркинье, блокирует K-каналы,; частоту импульсации CA-узла.",
                "Желудочковые и наджелудочковые аритмии.",
                "Полная AB-блокада (за исключением случаев наличия искусственного водителя ритма), блокада ветвей " +
                        "пучка Гиса, нарушения внутрижелудочковой проводимости, аберрантные ритмы, кардиогенный шок.",
                "Аритмогенное действие, AB-блокада, волчаночноподобный синдром, тахикардия, снижение сократимости миокарда, " +
                        "гипотензия, гепатит, анемия, тромбоцитопения, аллергические реакции.",
                "Дозы прдбираются индивидуально на основе клинической реакции. Перед началом лечения следует назначить пробную дозу " +
                        "(200 мг) внутрь для проверки переносимости. Следует иметь в виду, что антихолинергические свойства могут приводить к " +
                        "развитию кариеса, заболеванию околозубных тканей.",
                "Таблетки по 0,2."
            ),

            Card(
                "Амиодарон",
                "Кордарон",
                "Антиаритмические средства, III класс.",
                "Блокирует преимущественно K-каналы, в меньшей степени - Ca и Na, также является антагонистом a и b-адренорецепторов.",
                "Желудочковые и наджелудочковые аритмиию.",
                "Гиперчувстивительность к йоду, синусовая брадикардия, AB-блокада, синдром синусовой недостаточности, " +
                        "выраженные нарушения проводимости, кардиогенный шок, дисфункция щитовидной железы.",
                "Аритмогенное действие, брадикардия, сократимость миокарда, AB-проводимость, гипо- или гипертиреоз, " +
                        "фиброз легких, отложение липофусцина в роговице, гиперпигментация и фотосенсибилизация кожи, гепатотоксичность, " +
                        "периферические нейропатии и миопатии.",
                "Обязательный ЭКГ-контроль. Не рекумендуется сочетать с b-адреноблокаторами, верпамилом, " +
                        "дилтиземом, слабителельными, стимулирующими моторику ЖКТ. С осторожностью комбинируют с " +
                        "препаратами, вызывающими гипокалиемию.",
                "Таблетки по 0,2. Раствор для инъекций 5 % в ампулах по 3 мл."
            ),

            Card(
                "Пропафенон",
                "Пропанорм",
                "Антиаритмические средства, IC класс.",
                "Блокирует быстрые Na-каналы кардиомиоцитов с последующей медленной диссоциацией коммплекса \"вещество-канал\", что " +
                        "приводит к значительному угнетению проводимости предсердий, волокон Пуркинье и желудочков, угнетает автоматизм " +
                        "волокон Пуркинье",
                "Желудочковые и наджелудочковые аритмии.",
                "Повышенная чувствительность к пропафенону, синдром слабости CA-узла, тяжелая брадикардия и артериальная гипотензия, " +
                        "нарушения внутрипредсердной проводимост, AB-блокада II и III степени, блокада ножек пучка Гиса или дистальная блокада, " +
                        "выраженные нарушения  водно-электролитного баланса.",
                "Металлический привкус во рту, запор, аритмогенное действие. Усиление побочного эффекта может наблюдаться при одновременном " +
                        "применении с местными антисептиками или с другими ЛС, которые урежают ЧСС и/или сократимость миокарда.",
                "Лечение следует начинать в условиях стационара, посколку повышен риск проаритмогеннного действия, связанного с применением " +
                        "пропафенона. Влияние на способность к вождению автотранспорта, работу с механизмами.",
                "Таблетки по 0,15 и 0,30. Раствор 0,35 % в ампулах по 10 и 20 мл."
            ),

            Card(
                "Верапамил",
                "Изоптин",
                "Блокаторы кальциевых каналов, производные фенилкиламина.",
                "Блокирует Ca-каналы L-типа в открытом состоянии и нарушает поступление Ca внутрь клеток.",
                "Наджелудочковые аритмии, стабильная стенокардия, артериальная гипертензия.",
                "Гиперчувствительная, выраженная гипотензия, кардиогенный шок, AB-блокада II и III степени, " +
                        "выраженная барикардия, хроническая сердечная недостаточность III стадии, трепетание и фибриляция " +
                        "предсердий, синдром слабости синусного узла.",
                "Артериальная гипотензия, брадикардия, AB-блокада, спад силы сердечных сокращений, гиперемия кожи лица, " +
                        "констипация, задержка мочи.",
                "С осторожностью назначают пациентам с гипертрофической кардиомиопатией, осложнений обструкцией левого " +
                        "желудочка, высоким давлением заклинивания в легочных капилярах, пароксизмальной ночной одышкой или " +
                        "ортопноз, нарушением функции синусно-предсердечного узла.",
                "Таблетки по 0,04, 0,08, 0,24. Раствор для инъекций 0,25 % в ампулах по 2 мл.",
            ),

            Card(
                "Лидокаин",
                "",
                "Антиаритмические средства, IB класс",
                "Блокирует потенциал-зависимые Na-каналы афферентных нервных волокон, поавляя все виды " +
                        "болевой и тактильной виды чувствительности.",
                "Местная анестезия всех видов, тахиаритмии, желудочковые экстрасистолии.",
                "Эпилептиформные судороги в ответ на лидокаин в анамнезе, кардиогенный шок, " +
                        "слабость синусного узла, блокады сердца.",
                "Нейротоксичность, кардиотоксичность.",
                "Для удлинения действия анестетика возможно добавление 1 капли 0,1 % раствора адреналина " +
                        "на 5-10 мл лидокаина.",
                "Раствор 2 % в ампулах по 2 и 10 мл.",
            ),

            Card(
                "Аденозин",
                "Аденокор",
                "Антиаритмические средства.",
                "Механизм антиаритмического эффекта аденозина включает: ингибирование входящего тока Ca в атипичных " +
                        "кардиомиоцитах CA- и AB-узлов; активацию калиевых каналов внутреннего выпрямления в непесмейкерных " +
                        "кардиомицитах.",
                "Преобразование пароксизмальной наджелудочковой тахикардии в синусовый ритм.",
                "Гиперчувствительность, AB-блокада II и III степени или синдром слабости синусного угла, " +
                        "бронхиальная астма.",
                "Приливы крови, одышку и жжение в груди наблюдают у более 10 % пациентов. Кратковрененная AB-блокада, " +
                        "риск рахвития мерцательной аритмии.",
                "Введение через центральные вены снижает риск развития побочных эффектов. В/в введение допустимо только " +
                        "в условиях станционара, где есть возможность мониторинга деятельности сердца.",
                "Раствор для инъекций 0,3 % в расворе 0,9 % натрия хлорида во флаконах по 2 мл.",
            ),

            Card(
                "Ивабрадин",
                "Короксан",
                "Антиангиальные средства, брадикардические средства.",
                "Блокада lf-каналов CA-узла, спад ЧСС, спад потребности миокарда в кислороде.",
                "Стабильная стенокардия у пациентов с нормальным синусовым ритмом при непереносимости или " +
                        "противопоказаниях к применению b-блокаторов.",
                "Барикардия, кардиогенный шок, острый инфаркт миокарда, выраженная артериальная " +
                        "гипотензия, тажелая печеночная недостаточность, синдром слабости синусного узла, синоартериальная " +
                        "блокада, хроническая сердечная недостаточность III-IV степени.",
                "Слабо или умеренно выраженная фотопсия в основном в первые 2 месяца лечения с последующим " +
                        "повторением, нечеткость зрения, брадикардия, особенно в первые 2-3 месяца терапии.",
                "В период лечения должны быть сведены до минимума употребления грейпфрутового сока и прием препаратов " +
                        "зверобоя продырявленного.",
                "Таблетки по 0,0050 и 0,0075.",
            )
        )
    }
}