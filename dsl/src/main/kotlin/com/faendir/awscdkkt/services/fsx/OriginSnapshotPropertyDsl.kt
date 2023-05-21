package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnVolume

@Generated
public fun originSnapshotProperty(initializer: CfnVolume.OriginSnapshotProperty.Builder.() -> Unit =
    {}): CfnVolume.OriginSnapshotProperty =
    CfnVolume.OriginSnapshotProperty.builder().apply(initializer).build()
