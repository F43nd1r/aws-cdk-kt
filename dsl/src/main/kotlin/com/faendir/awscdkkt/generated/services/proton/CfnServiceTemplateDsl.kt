package com.faendir.awscdkkt.generated.services.proton

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.proton.CfnServiceTemplate
import software.amazon.awscdk.services.proton.CfnServiceTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceTemplate(id: String, initializer: @AwsCdkDsl
    CfnServiceTemplate.() -> Unit = {}): CfnServiceTemplate = CfnServiceTemplate(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnServiceTemplate(
  id: String,
  props: CfnServiceTemplateProps,
  initializer: @AwsCdkDsl CfnServiceTemplate.() -> Unit = {},
): CfnServiceTemplate = CfnServiceTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceTemplate(id: String, initializer: @AwsCdkDsl
    CfnServiceTemplate.Builder.() -> Unit = {}): CfnServiceTemplate =
    CfnServiceTemplate.Builder.create(this, id).apply(initializer).build()
