package Tests;

public class OpenJPA {
    /*public static void main(String[] arts) {
        EntityManagerFactory enManFac = getWithoutConfig();
        EntityManager em = enManFac.createEntityManager();
        EntityTransaction et = em.getTransaction();
        insertSong(enManFac,new Hund());
        et.begin();
        em.persist(new Hund());
        et.commit();



        et.begin();
      //  for (Object i : em.createQuery("SELECT x from Hund x").getResultList()) {
      //      Hund h = (Hund) i;
      //      System.out.println(h.getTest());
      //  }
        et.commit();




        enManFac.close();
    }
    public static void insertSong(EntityManagerFactory emf, Hund hund ){
        EntityManager EM = emf.createEntityManager();
        EntityTransaction transaction = EM.getTransaction();
        transaction.begin();
        EM.persist(hund);
        transaction.commit();
    }
    public static EntityManagerFactory getWithoutConfig() {

        Map<String, String> map = new HashMap<String, String>();

        map.put("openjpa.ConnectionURL","jdbc:sqlite:G:/Users/Progamer/Desktop/hund.db");
        map.put("openjpa.ConnectionDriverName", "org.sqlite.JDBC");
        map.put("openjpa.RuntimeUnenhancedClasses", "supported");
        map.put("openjpa.jdbc.SynchronizeMappings", "false");

        // find all classes to registrate them
        List<Class<?>> types = new ArrayList<Class<?>>();
        types.add(Hund.class);

        if (!types.isEmpty()) {
            StringBuffer buf = new StringBuffer();
            for (Class<?> c : types) {
                if (buf.length() > 0)
                    buf.append(";");
                buf.append(c.getName());
            }
            // <class>Pizza</class>
            map.put("openjpa.MetaDataFactory", "jpa(Types=" + buf.toString()+ ")");
        }

        return OpenJPAPersistence.getEntityManagerFactory(map);

    }
    */
}
