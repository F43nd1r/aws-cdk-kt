package com.faendir.awscdkkt.generated.services.efs

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl FileSystem.() -> Unit = {},
): FileSystem = FileSystem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFileSystem(id: String, initializer: @AwsCdkDsl
    FileSystem.Builder.() -> Unit = {}): FileSystem = FileSystem.Builder.create(this,
    id).apply(initializer).build()
