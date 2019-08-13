### Scismo

It`s usefull for bring the recently earthquakes on Chile.

1. ```sbt compile```+

2. ```sbt test```

3. ```sbt run```

  `[info] Running imcamilo.com.github.Scismo`

4. ```curl localhost:8081/eq```

```json
[
  {
    "localDate": "Fecha Local",
    "place": "Lugar",
    "magnitude": "Magnitud"
  },
  {
    "localDate": "2019/08/13 00:53:52",
    "place": "37 km al NE de Calama",
    "magnitude": "4.2 Ml"
  },
  {
    "localDate": "2019/08/12 17:40:20",
    "place": "31 km al O de Camiña",
    "magnitude": "4.5 Mw"
  },
  {
    "localDate": "2019/08/12 17:37:35",
    "place": "39 km al E de Mina Los Pelambres",
    "magnitude": "3.1 Ml"
  },
  {
    "localDate": "2019/08/12 10:16:21",
    "place": "27 km al SO de Mina Los Pelambres",
    "magnitude": "3.1 Ml"
  },
  {
    "localDate": "2019/08/12 09:31:41",
    "place": "14 km al SO de Ovalle",
    "magnitude": "3.0 Ml"
  },
  {
    "localDate": "2019/08/12 08:27:31",
    "place": "126 km al S de Oruro",
    "magnitude": "3.3 Ml"
  },
  {
      "localDate": "2019/08/12 05:14:33",
      "place": "110 km al E de Socaire",
      "magnitude": "3.5 Ml"
  },
  {
    "localDate": "2019/08/12 04:17:50",
    "place": "29 km al SE de Pica",
    "magnitude": "4.7 Mw"
  },
  {
    "localDate": "2019/08/11 20:40:20",
    "place": "70 km al O de La Serena",
    "magnitude": "3.0 Ml"
  },
  {
    "localDate": "2019/08/11 18:48:19",
    "place": "78 km al SE de Socaire",
    "magnitude": "3.6 Ml"
  },
  {
    "localDate": "2019/08/11 17:39:47",
    "place": "15 km al S de Tongoy",
    "magnitude": "3.7 Ml"
  },
  {
    "localDate": "2019/08/11 16:13:37",
    "place": "30 km al SE de Sierra Gorda.",
    "magnitude": "3.2 Ml"
  },
  {
    "localDate": "2019/08/11 12:31:56",
    "place": "54 km al NO de Valparaíso",
    "magnitude": "3.3 Ml"
  },
  {
    "localDate": "2019/08/11 11:38:46",
    "place": "44 km al SO de Ollagüe",
    "magnitude": "3.6 Ml"
  },
  {
    "localDate": "2019/08/11 06:27:35",
    "place": "125 km al NE de San Pedro de Atacama",
    "magnitude": "3.9 Ml"
  }
]

```

u could improve scismo
