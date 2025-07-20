package com.faendir.awscdkkt.generated.services.verifiedpermissions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicyTemplate(
  id: String,
  props: CfnPolicyTemplateProps,
  initializer: @AwsCdkDsl CfnPolicyTemplate.() -> Unit = {},
): CfnPolicyTemplate = CfnPolicyTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPolicyTemplate(id: String, initializer: @AwsCdkDsl CfnPolicyTemplate.Builder.() -> Unit = {}): CfnPolicyTemplate = CfnPolicyTemplate.Builder.create(this, id).apply(initializer).build()
