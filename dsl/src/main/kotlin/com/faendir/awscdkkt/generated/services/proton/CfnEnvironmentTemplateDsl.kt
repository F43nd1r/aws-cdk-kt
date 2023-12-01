package com.faendir.awscdkkt.generated.services.proton

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.proton.CfnEnvironmentTemplate
import software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnvironmentTemplate(id: String, initializer: @AwsCdkDsl
    CfnEnvironmentTemplate.() -> Unit = {}): CfnEnvironmentTemplate = CfnEnvironmentTemplate(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnEnvironmentTemplate(
  id: String,
  props: CfnEnvironmentTemplateProps,
  initializer: @AwsCdkDsl CfnEnvironmentTemplate.() -> Unit = {},
): CfnEnvironmentTemplate = CfnEnvironmentTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEnvironmentTemplate(id: String, initializer: @AwsCdkDsl
    CfnEnvironmentTemplate.Builder.() -> Unit = {}): CfnEnvironmentTemplate =
    CfnEnvironmentTemplate.Builder.create(this, id).apply(initializer).build()
