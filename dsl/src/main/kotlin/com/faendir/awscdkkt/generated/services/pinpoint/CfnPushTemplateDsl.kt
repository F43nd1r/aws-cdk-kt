package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPushTemplate(id: String, props: CfnPushTemplateProps): CfnPushTemplate =
    CfnPushTemplate(this, id, props)

@Generated
public fun Construct.cfnPushTemplate(
  id: String,
  props: CfnPushTemplateProps,
  initializer: @AwsCdkDsl CfnPushTemplate.() -> Unit,
): CfnPushTemplate = CfnPushTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPushTemplate(id: String, initializer: @AwsCdkDsl
    CfnPushTemplate.Builder.() -> Unit): CfnPushTemplate = CfnPushTemplate.Builder.create(this,
    id).apply(initializer).build()
