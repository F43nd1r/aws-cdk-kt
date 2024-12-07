package com.faendir.awscdkkt.generated.services.iotfleetwise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnStateTemplate
import software.amazon.awscdk.services.iotfleetwise.CfnStateTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStateTemplate(
  id: String,
  props: CfnStateTemplateProps,
  initializer: @AwsCdkDsl CfnStateTemplate.() -> Unit = {},
): CfnStateTemplate = CfnStateTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStateTemplate(id: String, initializer: @AwsCdkDsl
    CfnStateTemplate.Builder.() -> Unit = {}): CfnStateTemplate =
    CfnStateTemplate.Builder.create(this, id).apply(initializer).build()
