package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.FileSystem
import software.amazon.awscdk.services.efs.FileSystemProps
import software.constructs.Construct

@Generated
public fun Construct.fileSystem(
  id: String,
  props: FileSystemProps,
  initializer: FileSystem.() -> Unit = {},
): FileSystem = FileSystem(this, id, props).apply(initializer)
