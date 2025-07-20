package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTemplate(id: String, initializer: @AwsCdkDsl CfnTemplate.() -> Unit = {}): CfnTemplate = CfnTemplate(this, id).apply(initializer)

@Generated
public fun Construct.cfnTemplate(
  id: String,
  props: CfnTemplateProps,
  initializer: @AwsCdkDsl CfnTemplate.() -> Unit = {},
): CfnTemplate = CfnTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTemplate(id: String, initializer: @AwsCdkDsl CfnTemplate.Builder.() -> Unit = {}): CfnTemplate = CfnTemplate.Builder.create(this, id).apply(initializer).build()
