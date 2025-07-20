package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnPodIdentityAssociation
import software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPodIdentityAssociation(
  id: String,
  props: CfnPodIdentityAssociationProps,
  initializer: @AwsCdkDsl CfnPodIdentityAssociation.() -> Unit = {},
): CfnPodIdentityAssociation = CfnPodIdentityAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPodIdentityAssociation(id: String, initializer: @AwsCdkDsl CfnPodIdentityAssociation.Builder.() -> Unit = {}): CfnPodIdentityAssociation = CfnPodIdentityAssociation.Builder.create(this, id).apply(initializer).build()
