package com.yxph;

public class dataContact implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long id;

   private java.lang.String identityId;

   private java.lang.String contactCardId;

   private java.lang.String contactName;

   public dataContact()
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

   public java.lang.String getIdentityId()
   {
      return this.identityId;
   }

   public void setIdentityId(java.lang.String identityId)
   {
      this.identityId = identityId;
   }

   public java.lang.String getContactCardId()
   {
      return this.contactCardId;
   }

   public void setContactCardId(java.lang.String contactCardId)
   {
      this.contactCardId = contactCardId;
   }

   public java.lang.String getContactName()
   {
      return this.contactName;
   }

   public void setContactName(java.lang.String contactName)
   {
      this.contactName = contactName;
   }

   public dataContact(java.lang.Long id, java.lang.String identityId,
         java.lang.String contactCardId, java.lang.String contactName)
   {
      this.id = id;
      this.identityId = identityId;
      this.contactCardId = contactCardId;
      this.contactName = contactName;
   }

}