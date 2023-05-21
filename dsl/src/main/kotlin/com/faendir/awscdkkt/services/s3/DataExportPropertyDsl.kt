package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

@Generated
public fun dataExportProperty(initializer: CfnStorageLens.DataExportProperty.Builder.() -> Unit =
    {}): CfnStorageLens.DataExportProperty =
    CfnStorageLens.DataExportProperty.builder().apply(initializer).build()
