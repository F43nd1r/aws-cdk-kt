@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation

public fun s3Property(initializer: CfnDataRepositoryAssociation.S3Property.Builder.() -> Unit):
    CfnDataRepositoryAssociation.S3Property =
    CfnDataRepositoryAssociation.S3Property.builder().apply(initializer).build()
