package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceDataSync(
  id: String,
  props: CfnResourceDataSyncProps,
  initializer: @AwsCdkDsl CfnResourceDataSync.() -> Unit = {},
): CfnResourceDataSync = CfnResourceDataSync(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceDataSync(id: String, initializer: @AwsCdkDsl CfnResourceDataSync.Builder.() -> Unit = {}): CfnResourceDataSync = CfnResourceDataSync.Builder.create(this, id).apply(initializer).build()
