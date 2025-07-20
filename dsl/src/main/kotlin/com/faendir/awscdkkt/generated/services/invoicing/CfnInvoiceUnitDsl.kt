package com.faendir.awscdkkt.generated.services.invoicing

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.invoicing.CfnInvoiceUnit
import software.amazon.awscdk.services.invoicing.CfnInvoiceUnitProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInvoiceUnit(
  id: String,
  props: CfnInvoiceUnitProps,
  initializer: @AwsCdkDsl CfnInvoiceUnit.() -> Unit = {},
): CfnInvoiceUnit = CfnInvoiceUnit(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInvoiceUnit(id: String, initializer: @AwsCdkDsl CfnInvoiceUnit.Builder.() -> Unit = {}): CfnInvoiceUnit = CfnInvoiceUnit.Builder.create(this, id).apply(initializer).build()
