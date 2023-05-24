package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Volume
import software.amazon.awscdk.services.ec2.VolumeProps
import software.constructs.Construct

@Generated
public fun Construct.volume(id: String, props: VolumeProps): Volume = Volume(this, id, props)

@Generated
public fun Construct.volume(
  id: String,
  props: VolumeProps,
  initializer: @AwsCdkDsl Volume.() -> Unit,
): Volume = Volume(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVolume(id: String, initializer: @AwsCdkDsl Volume.Builder.() -> Unit):
    Volume = Volume.Builder.create(this, id).apply(initializer).build()
