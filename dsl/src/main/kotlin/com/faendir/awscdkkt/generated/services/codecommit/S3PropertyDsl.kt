package com.faendir.awscdkkt.generated.services.codecommit

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository

@Generated
public fun buildS3Property(initializer: @AwsCdkDsl CfnRepository.S3Property.Builder.() -> Unit):
    CfnRepository.S3Property = CfnRepository.S3Property.Builder().apply(initializer).build()
