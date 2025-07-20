package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess
import software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSnapshotBlockPublicAccess(
  id: String,
  props: CfnSnapshotBlockPublicAccessProps,
  initializer: @AwsCdkDsl CfnSnapshotBlockPublicAccess.() -> Unit = {},
): CfnSnapshotBlockPublicAccess = CfnSnapshotBlockPublicAccess(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSnapshotBlockPublicAccess(id: String, initializer: @AwsCdkDsl CfnSnapshotBlockPublicAccess.Builder.() -> Unit = {}): CfnSnapshotBlockPublicAccess = CfnSnapshotBlockPublicAccess.Builder.create(this, id).apply(initializer).build()
