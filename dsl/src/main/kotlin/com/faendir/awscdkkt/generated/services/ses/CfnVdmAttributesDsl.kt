package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.amazon.awscdk.services.ses.CfnVdmAttributesProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVdmAttributes(id: String, initializer: @AwsCdkDsl
    CfnVdmAttributes.() -> Unit = {}): CfnVdmAttributes = CfnVdmAttributes(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnVdmAttributes(
  id: String,
  props: CfnVdmAttributesProps,
  initializer: @AwsCdkDsl CfnVdmAttributes.() -> Unit = {},
): CfnVdmAttributes = CfnVdmAttributes(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVdmAttributes(id: String, initializer: @AwsCdkDsl
    CfnVdmAttributes.Builder.() -> Unit = {}): CfnVdmAttributes =
    CfnVdmAttributes.Builder.create(this, id).apply(initializer).build()
