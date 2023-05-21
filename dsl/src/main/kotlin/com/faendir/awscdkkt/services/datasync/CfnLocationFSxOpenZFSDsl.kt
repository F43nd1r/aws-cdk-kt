package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationFSxOpenZFS(
  id: String,
  props: CfnLocationFSxOpenZFSProps,
  initializer: CfnLocationFSxOpenZFS.() -> Unit = {},
): CfnLocationFSxOpenZFS = CfnLocationFSxOpenZFS(this, id, props).apply(initializer)
