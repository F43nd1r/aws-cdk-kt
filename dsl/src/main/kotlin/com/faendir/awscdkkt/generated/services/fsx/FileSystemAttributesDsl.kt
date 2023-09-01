package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.FileSystemAttributes

@Generated
public fun buildFileSystemAttributes(initializer: @AwsCdkDsl FileSystemAttributes.Builder.() -> Unit
    = {}): FileSystemAttributes = FileSystemAttributes.Builder().apply(initializer).build()
