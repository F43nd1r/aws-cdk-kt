@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps
import software.constructs.Construct

public fun Construct.cfnLocationFSxOpenZFS(
  id: String,
  props: CfnLocationFSxOpenZFSProps,
  initializer: CfnLocationFSxOpenZFS.() -> Unit = {},
): CfnLocationFSxOpenZFS = CfnLocationFSxOpenZFS(this, id, props).apply(initializer)
