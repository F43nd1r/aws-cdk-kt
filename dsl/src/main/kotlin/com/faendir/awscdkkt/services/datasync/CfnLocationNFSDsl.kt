package com.faendir.awscdkkt.services.datasync

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
  initializer: CfnLocationNFS.() -> Unit = {},
): CfnLocationNFS = CfnLocationNFS(this, id, props).apply(initializer)
