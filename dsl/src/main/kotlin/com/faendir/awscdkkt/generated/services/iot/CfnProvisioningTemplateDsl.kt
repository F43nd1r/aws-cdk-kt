package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate
import software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProvisioningTemplate(
  id: String,
  props: CfnProvisioningTemplateProps,
  initializer: @AwsCdkDsl CfnProvisioningTemplate.() -> Unit = {},
): CfnProvisioningTemplate = CfnProvisioningTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProvisioningTemplate(id: String, initializer: @AwsCdkDsl
    CfnProvisioningTemplate.Builder.() -> Unit = {}): CfnProvisioningTemplate =
    CfnProvisioningTemplate.Builder.create(this, id).apply(initializer).build()
