package com.netshoes.dynamicshipping;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DynamicShipping implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private boolean eligibleFreeShipping;

   private boolean eligibleDiscount;

   private boolean eligibleOvercharge;

   private java.math.BigDecimal discount;

   private boolean freeShipping;

   private java.util.List<java.lang.String> appliedRules;

   public DynamicShipping()
   {
   }

   public boolean isEligibleFreeShipping()
   {
      return this.eligibleFreeShipping;
   }

   public void setEligibleFreeShipping(boolean eligibleFreeShipping)
   {
      this.eligibleFreeShipping = eligibleFreeShipping;
   }

   public boolean isEligibleDiscount()
   {
      return this.eligibleDiscount;
   }

   public void setEligibleDiscount(boolean eligibleDiscount)
   {
      this.eligibleDiscount = eligibleDiscount;
   }

   public boolean isEligibleOvercharge()
   {
      return this.eligibleOvercharge;
   }

   public void setEligibleOvercharge(boolean eligibleOvercharge)
   {
      this.eligibleOvercharge = eligibleOvercharge;
   }

   public java.math.BigDecimal getDiscount()
   {
      return this.discount;
   }

   public void setDiscount(java.math.BigDecimal discount)
   {
      this.discount = discount;
   }

   public boolean isFreeShipping()
   {
      return this.freeShipping;
   }

   public void setFreeShipping(boolean freeShipping)
   {
      this.freeShipping = freeShipping;
   }

   public java.util.List<java.lang.String> getAppliedRules()
   {
      return this.appliedRules;
   }

   public void setAppliedRules(java.util.List<java.lang.String> appliedRules)
   {
      this.appliedRules = appliedRules;
   }

   public DynamicShipping(boolean eligibleFreeShipping, boolean eligibleDiscount,
         boolean eligibleOvercharge, java.math.BigDecimal discount,
         boolean freeShipping, java.util.List<java.lang.String> appliedRules)
   {
      this.eligibleFreeShipping = eligibleFreeShipping;
      this.eligibleDiscount = eligibleDiscount;
      this.eligibleOvercharge = eligibleOvercharge;
      this.discount = discount;
      this.freeShipping = freeShipping;
      this.appliedRules = appliedRules;
   }

}