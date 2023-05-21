package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps

@Generated
public fun efsFileSystemLocationProps(initializer: EfsFileSystemLocationProps.Builder.() -> Unit =
    {}): EfsFileSystemLocationProps =
    EfsFileSystemLocationProps.builder().apply(initializer).build()
