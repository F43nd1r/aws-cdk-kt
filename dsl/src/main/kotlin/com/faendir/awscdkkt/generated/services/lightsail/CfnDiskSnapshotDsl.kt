package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDiskSnapshot
import software.amazon.awscdk.services.lightsail.CfnDiskSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDiskSnapshot(
  id: String,
  props: CfnDiskSnapshotProps,
  initializer: @AwsCdkDsl CfnDiskSnapshot.() -> Unit = {},
): CfnDiskSnapshot = CfnDiskSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDiskSnapshot(id: String, initializer: @AwsCdkDsl CfnDiskSnapshot.Builder.() -> Unit = {}): CfnDiskSnapshot = CfnDiskSnapshot.Builder.create(this, id).apply(initializer).build()
