package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationNFS
import software.amazon.awscdk.services.datasync.CfnLocationNFSProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationNFS(
  id: String,
  props: CfnLocationNFSProps,
  initializer: @AwsCdkDsl CfnLocationNFS.() -> Unit = {},
): CfnLocationNFS = CfnLocationNFS(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationNFS(id: String, initializer: @AwsCdkDsl CfnLocationNFS.Builder.() -> Unit = {}): CfnLocationNFS = CfnLocationNFS.Builder.create(this, id).apply(initializer).build()
