package com.faendir.awscdkkt.generated.services.redshiftserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshiftserverless.CfnSnapshot
import software.amazon.awscdk.services.redshiftserverless.CfnSnapshotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSnapshot(
  id: String,
  props: CfnSnapshotProps,
  initializer: @AwsCdkDsl CfnSnapshot.() -> Unit = {},
): CfnSnapshot = CfnSnapshot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSnapshot(id: String, initializer: @AwsCdkDsl
    CfnSnapshot.Builder.() -> Unit = {}): CfnSnapshot = CfnSnapshot.Builder.create(this,
    id).apply(initializer).build()
