@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2

public
    fun s3ReferenceDataSourceProperty(initializer: CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder.() -> Unit):
    CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty =
    CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.builder().apply(initializer).build()
