package com.faendir.awscdkkt.generated.services.workspacesinstances

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociation
import software.amazon.awscdk.services.workspacesinstances.CfnVolumeAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVolumeAssociation(
  id: String,
  props: CfnVolumeAssociationProps,
  initializer: @AwsCdkDsl CfnVolumeAssociation.() -> Unit = {},
): CfnVolumeAssociation = CfnVolumeAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVolumeAssociation(id: String, initializer: @AwsCdkDsl
    CfnVolumeAssociation.Builder.() -> Unit = {}): CfnVolumeAssociation =
    CfnVolumeAssociation.Builder.create(this, id).apply(initializer).build()
