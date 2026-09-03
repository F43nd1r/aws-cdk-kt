package com.faendir.awscdkkt.generated.services.eks_v2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks_v2.CfnPodIdentityAssociation
import software.amazon.awscdk.services.eks_v2.CfnPodIdentityAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPodIdentityAssociation(
  id: String,
  props: CfnPodIdentityAssociationProps,
  initializer: @AwsCdkDsl CfnPodIdentityAssociation.() -> Unit = {},
): CfnPodIdentityAssociation = CfnPodIdentityAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPodIdentityAssociation(id: String, initializer: @AwsCdkDsl CfnPodIdentityAssociation.Builder.() -> Unit = {}): CfnPodIdentityAssociation = CfnPodIdentityAssociation.Builder.create(this, id).apply(initializer).build()
