@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

public
    fun s3ReferenceDataSourceProperty(initializer: CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder.() -> Unit):
    CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty =
    CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.builder().apply(initializer).build()
