@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation

public fun s3Property(initializer: CfnDataRepositoryAssociation.S3Property.Builder.() -> Unit):
    CfnDataRepositoryAssociation.S3Property =
    CfnDataRepositoryAssociation.S3Property.builder().apply(initializer).build()
