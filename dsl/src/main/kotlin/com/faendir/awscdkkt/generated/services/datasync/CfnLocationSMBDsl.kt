package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationSMB
import software.amazon.awscdk.services.datasync.CfnLocationSMBProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationSMB(id: String, props: CfnLocationSMBProps): CfnLocationSMB =
    CfnLocationSMB(this, id, props)

@Generated
public fun Construct.cfnLocationSMB(
  id: String,
  props: CfnLocationSMBProps,
  initializer: @AwsCdkDsl CfnLocationSMB.() -> Unit,
): CfnLocationSMB = CfnLocationSMB(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationSMB(id: String, initializer: @AwsCdkDsl
    CfnLocationSMB.Builder.() -> Unit): CfnLocationSMB = CfnLocationSMB.Builder.create(this,
    id).apply(initializer).build()
