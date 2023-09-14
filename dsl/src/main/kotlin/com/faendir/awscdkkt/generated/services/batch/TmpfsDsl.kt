package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.Tmpfs

@Generated
public fun buildTmpfs(initializer: @AwsCdkDsl Tmpfs.Builder.() -> Unit = {}): Tmpfs =
    Tmpfs.Builder().apply(initializer).build()
