package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation

@Generated
public fun buildS3Property(initializer: @AwsCdkDsl
    CfnDataRepositoryAssociation.S3Property.Builder.() -> Unit = {}):
    CfnDataRepositoryAssociation.S3Property =
    CfnDataRepositoryAssociation.S3Property.Builder().apply(initializer).build()
