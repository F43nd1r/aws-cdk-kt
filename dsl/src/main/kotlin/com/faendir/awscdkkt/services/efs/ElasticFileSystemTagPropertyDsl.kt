package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnFileSystem

@Generated
public
    fun elasticFileSystemTagProperty(initializer: CfnFileSystem.ElasticFileSystemTagProperty.Builder.() -> Unit
    = {}): CfnFileSystem.ElasticFileSystemTagProperty =
    CfnFileSystem.ElasticFileSystemTagProperty.builder().apply(initializer).build()
