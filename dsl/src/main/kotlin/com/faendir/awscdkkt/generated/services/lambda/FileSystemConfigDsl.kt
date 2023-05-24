package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FileSystemConfig

@Generated
public fun buildFileSystemConfig(initializer: @AwsCdkDsl FileSystemConfig.Builder.() -> Unit):
    FileSystemConfig = FileSystemConfig.Builder().apply(initializer).build()
