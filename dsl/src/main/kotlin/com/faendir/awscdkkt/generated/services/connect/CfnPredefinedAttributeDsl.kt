package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnPredefinedAttribute
import software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPredefinedAttribute(
  id: String,
  props: CfnPredefinedAttributeProps,
  initializer: @AwsCdkDsl CfnPredefinedAttribute.() -> Unit = {},
): CfnPredefinedAttribute = CfnPredefinedAttribute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPredefinedAttribute(id: String, initializer: @AwsCdkDsl
    CfnPredefinedAttribute.Builder.() -> Unit = {}): CfnPredefinedAttribute =
    CfnPredefinedAttribute.Builder.create(this, id).apply(initializer).build()
