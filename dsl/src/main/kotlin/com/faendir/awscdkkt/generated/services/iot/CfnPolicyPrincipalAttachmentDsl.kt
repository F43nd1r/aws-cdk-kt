package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicyPrincipalAttachment(id: String,
    props: CfnPolicyPrincipalAttachmentProps): CfnPolicyPrincipalAttachment =
    CfnPolicyPrincipalAttachment(this, id, props)

@Generated
public fun Construct.cfnPolicyPrincipalAttachment(
  id: String,
  props: CfnPolicyPrincipalAttachmentProps,
  initializer: @AwsCdkDsl CfnPolicyPrincipalAttachment.() -> Unit,
): CfnPolicyPrincipalAttachment = CfnPolicyPrincipalAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPolicyPrincipalAttachment(id: String, initializer: @AwsCdkDsl
    CfnPolicyPrincipalAttachment.Builder.() -> Unit): CfnPolicyPrincipalAttachment =
    CfnPolicyPrincipalAttachment.Builder.create(this, id).apply(initializer).build()
