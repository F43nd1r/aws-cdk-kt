package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationFSxONTAP(
  id: String,
  props: CfnLocationFSxONTAPProps,
  initializer: @AwsCdkDsl CfnLocationFSxONTAP.() -> Unit = {},
): CfnLocationFSxONTAP = CfnLocationFSxONTAP(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationFSxONTAP(id: String, initializer: @AwsCdkDsl CfnLocationFSxONTAP.Builder.() -> Unit = {}): CfnLocationFSxONTAP = CfnLocationFSxONTAP.Builder.create(this, id).apply(initializer).build()
