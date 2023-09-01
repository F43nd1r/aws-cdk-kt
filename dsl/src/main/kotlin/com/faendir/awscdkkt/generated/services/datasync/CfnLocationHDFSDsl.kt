package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationHDFS
import software.amazon.awscdk.services.datasync.CfnLocationHDFSProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationHDFS(
  id: String,
  props: CfnLocationHDFSProps,
  initializer: @AwsCdkDsl CfnLocationHDFS.() -> Unit = {},
): CfnLocationHDFS = CfnLocationHDFS(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationHDFS(id: String, initializer: @AwsCdkDsl
    CfnLocationHDFS.Builder.() -> Unit = {}): CfnLocationHDFS = CfnLocationHDFS.Builder.create(this,
    id).apply(initializer).build()
