package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInAppTemplate(
  id: String,
  props: CfnInAppTemplateProps,
  initializer: @AwsCdkDsl CfnInAppTemplate.() -> Unit = {},
): CfnInAppTemplate = CfnInAppTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInAppTemplate(id: String, initializer: @AwsCdkDsl
    CfnInAppTemplate.Builder.() -> Unit = {}): CfnInAppTemplate =
    CfnInAppTemplate.Builder.create(this, id).apply(initializer).build()
