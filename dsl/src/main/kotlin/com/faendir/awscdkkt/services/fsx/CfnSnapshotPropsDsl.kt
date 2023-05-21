package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnSnapshotProps

@Generated
public fun cfnSnapshotProps(initializer: CfnSnapshotProps.Builder.() -> Unit = {}): CfnSnapshotProps
    = CfnSnapshotProps.builder().apply(initializer).build()
