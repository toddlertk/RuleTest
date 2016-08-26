package com.yxph;

public class dataObject1 implements java.io.Serializable
{

   static final long serialVersionUID = 1L;
   
   private java.lang.Long id;

   private java.lang.String name;

   private java.lang.String identityId;

   private java.lang.Byte sex;

   public dataObject1()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getIdentityId()
   {
      return this.identityId;
   }

   public void setIdentityId(java.lang.String identityId)
   {
      this.identityId = identityId;
   }

   public java.lang.Byte getSex()
   {
      return this.sex;
   }

   public void setSex(java.lang.Byte sex)
   {
      this.sex = sex;
   }

   public dataObject1(java.lang.Long id, java.lang.String name,
         java.lang.String identityId, java.lang.Byte sex)
   {
      this.id = id;
      this.name = name;
      this.identityId = identityId;
      this.sex = sex;
   }

}
