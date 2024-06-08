package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnPolicyAssociation
import software.amazon.awscdk.services.securityhub.CfnPolicyAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicyAssociation(
  id: String,
  props: CfnPolicyAssociationProps,
  initializer: @AwsCdkDsl CfnPolicyAssociation.() -> Unit = {},
): CfnPolicyAssociation = CfnPolicyAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPolicyAssociation(id: String, initializer: @AwsCdkDsl
    CfnPolicyAssociation.Builder.() -> Unit = {}): CfnPolicyAssociation =
    CfnPolicyAssociation.Builder.create(this, id).apply(initializer).build()
