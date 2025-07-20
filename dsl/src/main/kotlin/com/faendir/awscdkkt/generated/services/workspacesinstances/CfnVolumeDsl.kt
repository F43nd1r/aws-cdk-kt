package com.faendir.awscdkkt.generated.services.workspacesinstances

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesinstances.CfnVolume
import software.amazon.awscdk.services.workspacesinstances.CfnVolumeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVolume(
  id: String,
  props: CfnVolumeProps,
  initializer: @AwsCdkDsl CfnVolume.() -> Unit = {},
): CfnVolume = CfnVolume(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVolume(id: String, initializer: @AwsCdkDsl CfnVolume.Builder.() -> Unit = {}): CfnVolume = CfnVolume.Builder.create(this, id).apply(initializer).build()
