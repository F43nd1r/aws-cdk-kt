@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.FileSystem
import software.amazon.awscdk.services.efs.FileSystemProps
import software.constructs.Construct

public fun Construct.fileSystem(
  id: String,
  props: FileSystemProps,
  initializer: FileSystem.() -> Unit = {},
): FileSystem = FileSystem(this, id, props).apply(initializer)
