@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnFileSystem

public
    fun elasticFileSystemTagProperty(initializer: CfnFileSystem.ElasticFileSystemTagProperty.Builder.() -> Unit):
    CfnFileSystem.ElasticFileSystemTagProperty =
    CfnFileSystem.ElasticFileSystemTagProperty.builder().apply(initializer).build()
